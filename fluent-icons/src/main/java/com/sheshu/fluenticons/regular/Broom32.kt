package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Broom32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Broom32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(29.707f, 2.293f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            lineToRelative(-9.341f, 9.34f)
            curveToRelative(-2.905f, -2.205f, -7.014f, -1.873f, -9.647f, 0.747f)
            lineToRelative(-1.368f, 1.277f)
            lineToRelative(-5.35f, 2.433f)
            curveToRelative(-0.3f, 0.135f, -0.512f, 0.409f, -0.57f, 0.731f)
            curveToRelative(-0.06f, 0.323f, 0.044f, 0.654f, 0.276f, 0.886f)
            lineToRelative(12f, 12f)
            curveToRelative(0.232f, 0.232f, 0.563f, 0.335f, 0.886f, 0.277f)
            curveToRelative(0.322f, -0.059f, 0.596f, -0.272f, 0.731f, -0.57f)
            lineToRelative(2.425f, -5.335f)
            lineToRelative(1.372f, -1.372f)
            curveToRelative(2.65f, -2.65f, 2.87f, -6.766f, 0.66f, -9.66f)
            lineToRelative(9.34f, -9.34f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            close()
            moveTo(8.283f, 15.697f)
            lineToRelative(8.02f, 8.02f)
            lineToRelative(-1.616f, 3.555f)
            lineToRelative(-9.96f, -9.959f)
            lineToRelative(3.556f, -1.616f)
            close()
            moveToRelative(9.217f, 6.389f)
            lineToRelative(-7.561f, -7.561f)
            lineToRelative(0.743f, -0.694f)
            lineToRelative(0.025f, -0.024f)
            curveToRelative(2.13f, -2.13f, 5.497f, -2.188f, 7.586f, -0.1f)
            curveToRelative(2.108f, 2.109f, 2.108f, 5.477f, 0f, 7.586f)
            lineTo(17.5f, 22.086f)
            close()
        }
    }.build()
}
