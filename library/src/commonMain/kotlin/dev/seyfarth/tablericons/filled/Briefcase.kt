package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Briefcase: ImageVector
    get() {
        if (_Briefcase != null) {
            return _Briefcase!!
        }
        _Briefcase = ImageVector.Builder(
            name = "Filled.Briefcase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 13.478f)
                verticalLineToRelative(4.522f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineToRelative(-4.522f)
                lineToRelative(0.553f, 0.277f)
                arcToRelative(20.999f, 20.999f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.897f, -0.002f)
                lineToRelative(0.55f, -0.275f)
                close()
                moveTo(14f, 2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(2.242f)
                lineToRelative(-1.447f, 0.724f)
                arcToRelative(19.002f, 19.002f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16.726f, 0.186f)
                lineToRelative(-0.647f, -0.32f)
                lineToRelative(-1.18f, -0.59f)
                verticalLineToRelative(-2.242f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(4f)
                close()
                moveTo(12f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0.01f)
                curveToRelative(0f, -0.562f, -0.448f, -1.01f, -1f, -1.01f)
                close()
                moveTo(14f, 4f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                close()
            }
        }.build()

        return _Briefcase!!
    }

@Suppress("ObjectPropertyName")
private var _Briefcase: ImageVector? = null
