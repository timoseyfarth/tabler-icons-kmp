package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Clover2: ImageVector
    get() {
        if (_Clover2 != null) {
            return _Clover2!!
        }
        _Clover2 = ImageVector.Builder(
            name = "Filled.Clover2",
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
                moveTo(11f, 11f)
                lineToRelative(-3.397f, -3.44f)
                arcToRelative(2.104f, 2.104f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2.95f)
                arcToRelative(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.912f, 0f)
                lineToRelative(0.485f, 0.39f)
                lineToRelative(0.485f, -0.39f)
                arcToRelative(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.912f, 0f)
                arcToRelative(2.104f, 2.104f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.95f)
                lineToRelative(-3.397f, 3.44f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 11f)
                lineToRelative(-3.397f, 3.44f)
                arcToRelative(2.104f, 2.104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.95f)
                arcToRelative(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.912f, 0f)
                lineToRelative(0.485f, -0.39f)
                lineToRelative(0.485f, 0.39f)
                arcToRelative(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.912f, 0f)
                arcToRelative(2.104f, 2.104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.95f)
                lineToRelative(-3.397f, -3.44f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.44f, 7.603f)
                arcToRelative(2.104f, 2.104f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.95f, 0f)
                arcToRelative(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.912f)
                lineToRelative(-0.39f, 0.485f)
                lineToRelative(0.39f, 0.485f)
                arcToRelative(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.912f)
                arcToRelative(2.104f, 2.104f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.95f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.56f, 7.603f)
                arcToRelative(2.104f, 2.104f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.95f, 0f)
                arcToRelative(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.912f)
                lineToRelative(0.39f, 0.485f)
                lineToRelative(-0.39f, 0.485f)
                arcToRelative(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.912f)
                arcToRelative(2.104f, 2.104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.95f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 15f)
                lineToRelative(6f, 6f)
            }
        }.build()

        return _Clover2!!
    }

@Suppress("ObjectPropertyName")
private var _Clover2: ImageVector? = null
