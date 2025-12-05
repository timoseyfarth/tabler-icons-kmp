package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.FilterSpark: ImageVector
    get() {
        if (_FilterSpark != null) {
            return _FilterSpark!!
        }
        _FilterSpark = ImageVector.Builder(
            name = "Filled.FilterSpark",
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
                moveTo(15f, 12.5f)
                verticalLineToRelative(-0.5f)
                lineToRelative(4.414f, -4.414f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.586f, -1.414f)
                verticalLineToRelative(-2.172f)
                horizontalLineToRelative(-16f)
                verticalLineToRelative(2.227f)
                curveToRelative(0f, 0.497f, 0.185f, 0.977f, 0.52f, 1.345f)
                lineToRelative(4.48f, 4.928f)
                verticalLineToRelative(8.5f)
                lineToRelative(2f, -0.667f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.5f, 22f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, -3.5f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.5f, -3.5f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.5f, 3.5f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 3.5f)
            }
        }.build()

        return _FilterSpark!!
    }

@Suppress("ObjectPropertyName")
private var _FilterSpark: ImageVector? = null
