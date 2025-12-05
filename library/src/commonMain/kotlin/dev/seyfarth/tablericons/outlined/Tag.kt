package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Tag: ImageVector
    get() {
        if (_Tag != null) {
            return _Tag!!
        }
        _Tag = ImageVector.Builder(
            name = "Filled.Tag",
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
                moveTo(7.5f, 7.5f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 6f)
                verticalLineToRelative(5.172f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.586f, 1.414f)
                lineToRelative(7.71f, 7.71f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.408f, 0f)
                lineToRelative(5.592f, -5.592f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.408f)
                lineToRelative(-7.71f, -7.71f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.414f, -0.586f)
                horizontalLineToRelative(-5.172f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                close()
            }
        }.build()

        return _Tag!!
    }

@Suppress("ObjectPropertyName")
private var _Tag: ImageVector? = null
