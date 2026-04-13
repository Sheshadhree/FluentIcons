package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.New20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.New20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.5f, 3f)
            curveTo(15.776f, 3f, 16f, 3.224f, 16f, 3.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(15f, 11.776f, 15f, 11.5f)
            verticalLineToRelative(-8f)
            curveTo(15f, 3.224f, 15.224f, 3f, 15.5f, 3f)
            close()
            moveTo(6.146f, 6.146f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineToRelative(6f, 6f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineToRelative(-6f, -6f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            close()
            moveTo(3.5f, 15f)
            curveTo(3.224f, 15f, 3f, 15.224f, 3f, 15.5f)
            reflectiveCurveTo(3.224f, 16f, 3.5f, 16f)
            horizontalLineToRelative(8f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(11.776f, 15f, 11.5f, 15f)
            horizontalLineToRelative(-8f)
            close()
        }
    }.build()
}
