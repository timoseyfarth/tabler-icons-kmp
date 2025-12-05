package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Dashboard: ImageVector
    get() {
        if (_Dashboard != null) {
            return _Dashboard!!
        }
        _Dashboard = ImageVector.Builder(
            name = "Filled.Dashboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2.954f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.222f, 17.829f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.622f, 0.217f)
                horizontalLineToRelative(-11.2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.622f, -0.217f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.222f, -17.829f)
                moveToRelative(4.207f, 5.839f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.414f, 0f)
                lineToRelative(-2.276f, 2.274f)
                arcToRelative(2.003f, 2.003f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.514f, 1.815f)
                lineToRelative(-0.003f, 0.118f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3.933f, -0.517f)
                lineToRelative(2.274f, -2.276f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.414f)
            }
        }.build()

        return _Dashboard!!
    }

@Suppress("ObjectPropertyName")
private var _Dashboard: ImageVector? = null
