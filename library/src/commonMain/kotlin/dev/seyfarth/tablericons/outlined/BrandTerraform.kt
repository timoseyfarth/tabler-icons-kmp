package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandTerraform: ImageVector
    get() {
        if (_BrandTerraform != null) {
            return _BrandTerraform!!
        }
        _BrandTerraform = ImageVector.Builder(
            name = "Filled.BrandTerraform",
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
                moveTo(15f, 15.5f)
                lineToRelative(-11.476f, -6.216f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.524f, -0.88f)
                verticalLineToRelative(-4.054f)
                arcToRelative(1.35f, 1.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.03f, -1.166f)
                lineToRelative(9.97f, 5.816f)
                verticalLineToRelative(10.65f)
                arcToRelative(1.35f, 1.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.03f, 1.166f)
                lineToRelative(-3.474f, -2.027f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.496f, -0.863f)
                verticalLineToRelative(-11.926f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 15.5f)
                lineToRelative(5.504f, -3.21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.496f, -0.864f)
                verticalLineToRelative(-3.576f)
                arcToRelative(1.35f, 1.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.03f, -1.166f)
                lineToRelative(-3.97f, 2.316f)
            }
        }.build()

        return _BrandTerraform!!
    }

@Suppress("ObjectPropertyName")
private var _BrandTerraform: ImageVector? = null
