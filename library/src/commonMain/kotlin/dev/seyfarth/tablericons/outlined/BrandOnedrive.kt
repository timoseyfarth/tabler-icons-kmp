package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandOnedrive: ImageVector
    get() {
        if (_BrandOnedrive != null) {
            return _BrandOnedrive!!
        }
        _BrandOnedrive = ImageVector.Builder(
            name = "Filled.BrandOnedrive",
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
                moveTo(18.456f, 10.45f)
                arcToRelative(6.45f, 6.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, -2.151f)
                arcToRelative(4.857f, 4.857f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.44f, 5.241f)
                arcToRelative(4.856f, 4.856f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.236f, 4.444f)
                horizontalLineToRelative(10.751f)
                arcToRelative(3.771f, 3.771f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.99f, -3.54f)
                arcToRelative(3.772f, 3.772f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.538f, -3.992f)
                close()
            }
        }.build()

        return _BrandOnedrive!!
    }

@Suppress("ObjectPropertyName")
private var _BrandOnedrive: ImageVector? = null
