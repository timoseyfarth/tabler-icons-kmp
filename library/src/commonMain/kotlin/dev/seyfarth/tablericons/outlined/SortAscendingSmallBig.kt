package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.SortAscendingSmallBig: ImageVector
    get() {
        if (_SortAscendingSmallBig != null) {
            return _SortAscendingSmallBig!!
        }
        _SortAscendingSmallBig = ImageVector.Builder(
            name = "Filled.SortAscendingSmallBig",
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
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 5.667f)
                curveToRelative(0f, -0.369f, 0.298f, -0.667f, 0.667f, -0.667f)
                horizontalLineToRelative(2.666f)
                curveToRelative(0.369f, 0f, 0.667f, 0.298f, 0.667f, 0.667f)
                verticalLineToRelative(2.666f)
                arcToRelative(0.667f, 0.667f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.667f, 0.667f)
                horizontalLineToRelative(-2.666f)
                arcToRelative(0.667f, 0.667f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.667f, -0.667f)
                verticalLineToRelative(-2.666f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 13.167f)
                curveToRelative(0f, -0.645f, 0.522f, -1.167f, 1.167f, -1.167f)
                horizontalLineToRelative(4.666f)
                curveToRelative(0.645f, 0f, 1.167f, 0.522f, 1.167f, 1.167f)
                verticalLineToRelative(4.666f)
                curveToRelative(0f, 0.645f, -0.522f, 1.167f, -1.167f, 1.167f)
                horizontalLineToRelative(-4.666f)
                arcToRelative(1.167f, 1.167f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.167f, -1.167f)
                verticalLineToRelative(-4.666f)
                close()
            }
        }.build()

        return _SortAscendingSmallBig!!
    }

@Suppress("ObjectPropertyName")
private var _SortAscendingSmallBig: ImageVector? = null
