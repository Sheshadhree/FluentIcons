package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Spacebar20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Spacebar20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 8f)
            curveTo(2.776f, 8f, 3f, 8.224f, 3f, 8.5f)
            verticalLineToRelative(2f)
            curveTo(3f, 10.776f, 3.224f, 11f, 3.5f, 11f)
            horizontalLineToRelative(13f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-2f)
            curveTo(17f, 8.224f, 17.224f, 8f, 17.5f, 8f)
            reflectiveCurveTo(18f, 8.224f, 18f, 8.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-13f)
            curveTo(2.672f, 12f, 2f, 11.328f, 2f, 10.5f)
            verticalLineToRelative(-2f)
            curveTo(2f, 8.224f, 2.224f, 8f, 2.5f, 8f)
            close()
        }
    }.build()
}
