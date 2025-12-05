package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Horse: ImageVector
    get() {
        if (_Horse != null) {
            return _Horse!!
        }
        _Horse = ImageVector.Builder(
            name = "Filled.Horse",
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
                moveTo(7f, 10f)
                lineToRelative(-0.85f, 8.507f)
                arcToRelative(1.357f, 1.357f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.35f, 1.493f)
                horizontalLineToRelative(0.146f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.857f, -1.257f)
                lineToRelative(0.994f, -2.486f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.857f, -1.257f)
                horizontalLineToRelative(1.292f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.857f, 1.257f)
                lineToRelative(0.994f, 2.486f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.857f, 1.257f)
                horizontalLineToRelative(0.146f)
                arcToRelative(1.37f, 1.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.364f, -1.494f)
                lineToRelative(-0.864f, -9.506f)
                horizontalLineToRelative(-8f)
                curveToRelative(0f, -3f, -3f, -5f, -6f, -5f)
                lineToRelative(-3f, 6f)
                lineToRelative(2f, 2f)
                lineToRelative(3f, -2f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 14f)
                verticalLineToRelative(-2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
            }
        }.build()

        return _Horse!!
    }

@Suppress("ObjectPropertyName")
private var _Horse: ImageVector? = null
