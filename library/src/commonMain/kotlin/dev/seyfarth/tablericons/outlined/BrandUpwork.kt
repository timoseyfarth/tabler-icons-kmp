package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandUpwork: ImageVector
    get() {
        if (_BrandUpwork != null) {
            return _BrandUpwork!!
        }
        _BrandUpwork = ImageVector.Builder(
            name = "Filled.BrandUpwork",
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
                moveTo(3f, 7f)
                verticalLineToRelative(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(1f)
                lineToRelative(4f, 6f)
                curveToRelative(0.824f, 1.319f, 1.945f, 2f, 3.5f, 2f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -7f)
                curveToRelative(-2.027f, 0f, -3.137f, 1f, -3.5f, 3f)
                curveToRelative(-0.242f, 1.33f, -0.908f, 4f, -2f, 8f)
            }
        }.build()

        return _BrandUpwork!!
    }

@Suppress("ObjectPropertyName")
private var _BrandUpwork: ImageVector? = null
