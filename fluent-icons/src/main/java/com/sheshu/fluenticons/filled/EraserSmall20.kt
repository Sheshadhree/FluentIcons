package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.EraserSmall20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EraserSmall20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.44f, 11.2f)
            curveToRelative(-0.587f, 0.586f, -0.587f, 1.536f, 0f, 2.122f)
            lineToRelative(4.242f, 4.242f)
            curveToRelative(0.586f, 0.586f, 1.535f, 0.586f, 2.121f, 0f)
            lineToRelative(2.212f, -2.212f)
            curveTo(11.005f, 15.236f, 11f, 15.12f, 11f, 15f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            curveToRelative(0.119f, 0f, 0.236f, 0.005f, 0.352f, 0.015f)
            lineToRelative(2.212f, -2.212f)
            curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0f, -2.121f)
            lineToRelative(-4.242f, -4.243f)
            curveToRelative(-0.586f, -0.586f, -1.536f, -0.586f, -2.122f, 0f)
            lineTo(2.44f, 11.2f)
            close()
            moveToRelative(0.707f, 1.415f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.707f)
            lineToRelative(1.69f, -1.69f)
            lineToRelative(4.95f, 4.95f)
            lineToRelative(-1.69f, 1.69f)
            curveToRelative(-0.196f, 0.194f, -0.513f, 0.194f, -0.708f, 0f)
            lineToRelative(-4.242f, -4.243f)
            close()
            moveTo(15f, 18f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.343f, -3f, 3f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            close()
        }
    }.build()
}
