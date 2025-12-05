package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandSugarizer: ImageVector
    get() {
        if (_BrandSugarizer != null) {
            return _BrandSugarizer!!
        }
        _BrandSugarizer = ImageVector.Builder(
            name = "Filled.BrandSugarizer",
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
                moveTo(14.277f, 16f)
                lineToRelative(3.252f, -3.252f)
                arcToRelative(1.61f, 1.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.277f, -2.276f)
                lineToRelative(-3.252f, 3.251f)
                lineToRelative(-3.252f, -3.251f)
                arcToRelative(1.61f, 1.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.276f, 2.276f)
                lineToRelative(3.251f, 3.252f)
                lineToRelative(-3.251f, 3.252f)
                arcToRelative(1.61f, 1.61f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.276f, 2.277f)
                lineToRelative(3.252f, -3.252f)
                lineToRelative(3.252f, 3.252f)
                arcToRelative(1.61f, 1.61f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.277f, -2.277f)
                lineToRelative(-3.252f, -3.252f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 5f)
                moveToRelative(-3f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -6f, 0f)
            }
        }.build()

        return _BrandSugarizer!!
    }

@Suppress("ObjectPropertyName")
private var _BrandSugarizer: ImageVector? = null
