package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.SortDescendingLetters: ImageVector
    get() {
        if (_SortDescendingLetters != null) {
            return _SortDescendingLetters!!
        }
        _SortDescendingLetters = ImageVector.Builder(
            name = "Filled.SortDescendingLetters",
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
                moveTo(15f, 21f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.38f, 0.62f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.62f, 2f, 2f)
                verticalLineToRelative(5f)
                moveToRelative(0f, -3f)
                horizontalLineToRelative(-4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 10f)
                horizontalLineToRelative(-4f)
                lineToRelative(4f, -7f)
                horizontalLineToRelative(-4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 15f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 6f)
                verticalLineToRelative(12f)
            }
        }.build()

        return _SortDescendingLetters!!
    }

@Suppress("ObjectPropertyName")
private var _SortDescendingLetters: ImageVector? = null
