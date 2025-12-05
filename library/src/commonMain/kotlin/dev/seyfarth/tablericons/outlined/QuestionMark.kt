package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.QuestionMark: ImageVector
    get() {
        if (_QuestionMark != null) {
            return _QuestionMark!!
        }
        _QuestionMark = ImageVector.Builder(
            name = "Filled.QuestionMark",
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
                moveTo(8f, 8f)
                arcToRelative(3.5f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, -3f)
                horizontalLineToRelative(1f)
                arcToRelative(3.5f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 3f)
                arcToRelative(3f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 19f)
                lineToRelative(0f, 0.01f)
            }
        }.build()

        return _QuestionMark!!
    }

@Suppress("ObjectPropertyName")
private var _QuestionMark: ImageVector? = null
