package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Beaker20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Beaker20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 3f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(14.276f, 4f, 14f, 4f)
            horizontalLineToRelative(-0.996f)
            verticalLineToRelative(4.684f)
            curveToRelative(0f, 0.58f, 0.144f, 1.15f, 0.42f, 1.66f)
            lineToRelative(2.395f, 4.446f)
            curveToRelative(0.538f, 1f, -0.185f, 2.212f, -1.32f, 2.212f)
            horizontalLineTo(5.502f)
            curveToRelative(-1.136f, 0f, -1.859f, -1.213f, -1.32f, -2.212f)
            lineToRelative(2.394f, -4.443f)
            curveToRelative(0.275f, -0.51f, 0.418f, -1.081f, 0.418f, -1.66f)
            verticalLineTo(4f)
            horizontalLineTo(6f)
            curveTo(5.724f, 4f, 5.5f, 3.776f, 5.5f, 3.5f)
            reflectiveCurveTo(5.724f, 3f, 6f, 3f)
            horizontalLineToRelative(8f)
            close()
            moveTo(7.994f, 4f)
            verticalLineToRelative(4.687f)
            curveToRelative(0f, 0.745f, -0.185f, 1.478f, -0.538f, 2.134f)
            lineTo(6.821f, 12f)
            horizontalLineToRelative(6.359f)
            lineToRelative(-0.637f, -1.181f)
            curveToRelative(-0.353f, -0.657f, -0.539f, -1.39f, -0.539f, -2.135f)
            verticalLineTo(4f)
            horizontalLineToRelative(-4.01f)
            close()
            moveToRelative(5.724f, 9f)
            horizontalLineTo(6.282f)
            lineToRelative(-1.22f, 2.264f)
            curveToRelative(-0.18f, 0.334f, 0.062f, 0.738f, 0.44f, 0.738f)
            horizontalLineToRelative(8.997f)
            curveToRelative(0.378f, 0f, 0.62f, -0.404f, 0.44f, -0.738f)
            lineTo(13.719f, 13f)
            close()
        }
    }.build()
}
