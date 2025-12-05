package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ChartCohort: ImageVector
    get() {
        if (_ChartCohort != null) {
            return _ChartCohort!!
        }
        _ChartCohort = ImageVector.Builder(
            name = "Filled.ChartCohort",
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
                moveTo(3f, 9f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-18f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 15f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-12f)
            }
        }.build()

        return _ChartCohort!!
    }

@Suppress("ObjectPropertyName")
private var _ChartCohort: ImageVector? = null
