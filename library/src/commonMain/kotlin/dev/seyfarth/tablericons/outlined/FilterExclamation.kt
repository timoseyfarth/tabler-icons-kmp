package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.FilterExclamation: ImageVector
    get() {
        if (_FilterExclamation != null) {
            return _FilterExclamation!!
        }
        _FilterExclamation = ImageVector.Builder(
            name = "Filled.FilterExclamation",
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
                moveTo(4f, 4f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2.172f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.586f, 1.414f)
                lineToRelative(-4.414f, 4.414f)
                verticalLineToRelative(7f)
                lineToRelative(-6f, 2f)
                verticalLineToRelative(-8.5f)
                lineToRelative(-4.48f, -4.928f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.52f, -1.345f)
                verticalLineToRelative(-2.227f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 16f)
                verticalLineToRelative(3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 22f)
                verticalLineToRelative(0.01f)
            }
        }.build()

        return _FilterExclamation!!
    }

@Suppress("ObjectPropertyName")
private var _FilterExclamation: ImageVector? = null
