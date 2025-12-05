package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.HexagonLetterQ: ImageVector
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
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.666f, 1.429f)
                lineToRelative(6.75f, 3.98f)
                lineToRelative(0.096f, 0.063f)
                lineToRelative(0.093f, 0.078f)
                lineToRelative(0.106f, 0.074f)
                arcToRelative(3.22f, 3.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.284f, 2.39f)
                lineToRelative(0.005f, 0.204f)
                verticalLineToRelative(7.284f)
                curveToRelative(0f, 1.175f, -0.643f, 2.256f, -1.623f, 2.793f)
                lineToRelative(-6.804f, 4.302f)
                curveToRelative(-0.98f, 0.538f, -2.166f, 0.538f, -3.2f, -0.032f)
                lineToRelative(-6.695f, -4.237f)
                arcToRelative(3.23f, 3.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.678f, -2.826f)
                verticalLineToRelative(-7.285f)
                curveToRelative(0f, -1.106f, 0.57f, -2.128f, 1.476f, -2.705f)
                lineToRelative(6.95f, -4.098f)
                curveToRelative(1f, -0.552f, 2.214f, -0.552f, 3.24f, 0.015f)
                moveToRelative(-1.666f, 5.571f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.168f, 2.764f)
                lineToRelative(0.125f, -0.057f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.414f, -1.414f)
                lineToRelative(0.057f, -0.125f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.236f, -1.168f)
                verticalLineToRelative(-4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                moveToRelative(1f, 7.002f)
                horizontalLineToRelative(-0.059f)
                arcToRelative(0.996f, 0.996f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.941f, 0.998f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                close()
            }
        }.build()

        return _HexagonLetterQ!!
    }

@Suppress("ObjectPropertyName")
private var _HexagonLetterQ: ImageVector? = null
