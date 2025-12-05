package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Octahedron: ImageVector
    get() {
        if (_Octahedron != null) {
            return _Octahedron!!
        }
        _Octahedron = ImageVector.Builder(
            name = "Filled.Octahedron",
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
                moveTo(12.859f, 21.652f)
                lineToRelative(8.845f, -8.949f)
                arcToRelative(0.984f, 0.984f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.407f)
                lineToRelative(-8.845f, -8.948f)
                arcToRelative(1.233f, 1.233f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.718f, 0f)
                lineToRelative(-8.845f, 8.949f)
                arcToRelative(0.984f, 0.984f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.407f)
                lineToRelative(8.845f, 8.949f)
                arcToRelative(1.234f, 1.234f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.718f, -0.001f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 12f)
                curveToRelative(0.004f, 0.086f, 0.103f, 0.178f, 0.296f, 0.246f)
                lineToRelative(8.845f, 2.632f)
                curveToRelative(0.459f, 0.163f, 1.259f, 0.163f, 1.718f, 0f)
                lineToRelative(8.845f, -2.632f)
                curveToRelative(0.195f, -0.07f, 0.294f, -0.156f, 0.296f, -0.243f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 2.12f)
                verticalLineToRelative(19.76f)
            }
        }.build()

        return _Octahedron!!
    }

@Suppress("ObjectPropertyName")
private var _Octahedron: ImageVector? = null
