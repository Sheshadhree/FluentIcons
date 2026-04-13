package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.Link32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Link32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 15.5f)
            curveTo(2f, 11.91f, 4.91f, 9f, 8.5f, 9f)
            horizontalLineToRelative(5f)
            curveTo(13.776f, 9f, 14f, 9.224f, 14f, 9.5f)
            reflectiveCurveTo(13.776f, 10f, 13.5f, 10f)
            horizontalLineToRelative(-5f)
            curveTo(5.462f, 10f, 3f, 12.462f, 3f, 15.5f)
            reflectiveCurveTo(5.462f, 21f, 8.5f, 21f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(13.776f, 22f, 13.5f, 22f)
            horizontalLineToRelative(-5f)
            curveTo(4.91f, 22f, 2f, 19.09f, 2f, 15.5f)
            close()
            moveToRelative(28f, 0f)
            curveToRelative(0f, -3.59f, -2.91f, -6.5f, -6.5f, -6.5f)
            horizontalLineToRelative(-5f)
            curveTo(18.224f, 9f, 18f, 9.224f, 18f, 9.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(5f)
            curveToRelative(3.038f, 0f, 5.5f, 2.462f, 5.5f, 5.5f)
            reflectiveCurveTo(26.538f, 21f, 23.5f, 21f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(5f)
            curveToRelative(3.59f, 0f, 6.5f, -2.91f, 6.5f, -6.5f)
            close()
            moveTo(9.5f, 15f)
            curveTo(9.224f, 15f, 9f, 15.224f, 9f, 15.5f)
            reflectiveCurveTo(9.224f, 16f, 9.5f, 16f)
            horizontalLineToRelative(13f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(22.776f, 15f, 22.5f, 15f)
            horizontalLineToRelative(-13f)
            close()
        }
    }.build()
}
