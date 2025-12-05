package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.HexagonLetterQ: ImageVector
    get() {
        if (_HexagonLetterQ != null) {
            return _HexagonLetterQ!!
        }
        _HexagonLetterQ = ImageVector.Builder(
            name = "Filled.HexagonLetterQ",
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
                moveTo(19.875f, 6.27f)
                arcToRelative(2.225f, 2.225f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.125f, 1.948f)
                verticalLineToRelative(7.284f)
                curveToRelative(0f, 0.809f, -0.443f, 1.555f, -1.158f, 1.948f)
                lineToRelative(-6.75f, 4.27f)
                arcToRelative(2.269f, 2.269f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.184f, 0f)
                lineToRelative(-6.75f, -4.27f)
                arcToRelative(2.225f, 2.225f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.158f, -1.948f)
                verticalLineToRelative(-7.285f)
                curveToRelative(0f, -0.809f, 0.443f, -1.554f, 1.158f, -1.947f)
                lineToRelative(6.75f, -3.98f)
                arcToRelative(2.33f, 2.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, 0f)
                lineToRelative(6.75f, 3.98f)
                horizontalLineToRelative(-0.033f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
                verticalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 15f)
                lineToRelative(1f, 1f)
            }
        }.build()

        return _HexagonLetterQ!!
    }

@Suppress("ObjectPropertyName")
private var _HexagonLetterQ: ImageVector? = null
