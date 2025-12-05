package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CircuitInductor: ImageVector
    get() {
        if (_CircuitInductor != null) {
            return _CircuitInductor!!
        }
        _CircuitInductor = ImageVector.Builder(
            name = "Filled.CircuitInductor",
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
                moveTo(2f, 14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                verticalLineToRelative(2f)
                verticalLineToRelative(-1.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                verticalLineToRelative(1.5f)
                verticalLineToRelative(-1.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(3f)
            }
        }.build()

        return _CircuitInductor!!
    }

@Suppress("ObjectPropertyName")
private var _CircuitInductor: ImageVector? = null
