package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ArrowMerge: ImageVector
    get() {
        if (_ArrowMerge != null) {
            return _ArrowMerge!!
        }
        _ArrowMerge = ImageVector.Builder(
            name = "Filled.ArrowMerge",
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
                moveTo(8f, 7f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                verticalLineToRelative(5.394f)
                arcToRelative(6.737f, 6.737f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 5.606f)
                arcToRelative(6.737f, 6.737f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 5.606f)
                verticalLineToRelative(1.394f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                verticalLineToRelative(5.394f)
                arcToRelative(6.737f, 6.737f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5.606f)
                arcToRelative(6.737f, 6.737f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 5.606f)
                verticalLineToRelative(1.394f)
            }
        }.build()

        return _ArrowMerge!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowMerge: ImageVector? = null
