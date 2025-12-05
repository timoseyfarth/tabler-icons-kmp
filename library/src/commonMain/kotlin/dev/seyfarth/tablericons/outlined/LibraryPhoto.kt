package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.LibraryPhoto: ImageVector
    get() {
        if (_LibraryPhoto != null) {
            return _LibraryPhoto!!
        }
        _LibraryPhoto = ImageVector.Builder(
            name = "Filled.LibraryPhoto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 3f)
                moveToRelative(0f, 2.667f)
                arcToRelative(2.667f, 2.667f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.667f, -2.667f)
                horizontalLineToRelative(8.666f)
                arcToRelative(2.667f, 2.667f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.667f, 2.667f)
                verticalLineToRelative(8.666f)
                arcToRelative(2.667f, 2.667f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.667f, 2.667f)
                horizontalLineToRelative(-8.666f)
                arcToRelative(2.667f, 2.667f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.667f, -2.667f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.012f, 7.26f)
                arcToRelative(2.005f, 2.005f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.012f, 1.737f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(10f)
                curveToRelative(0.75f, 0f, 1.158f, -0.385f, 1.5f, -1f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 7f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 13f)
                lineToRelative(3.644f, -3.644f)
                arcToRelative(1.21f, 1.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.712f, 0f)
                lineToRelative(3.644f, 3.644f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 12f)
                lineToRelative(1.644f, -1.644f)
                arcToRelative(1.21f, 1.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.712f, 0f)
                lineToRelative(2.644f, 2.644f)
            }
        }.build()

        return _LibraryPhoto!!
    }

@Suppress("ObjectPropertyName")
private var _LibraryPhoto: ImageVector? = null
