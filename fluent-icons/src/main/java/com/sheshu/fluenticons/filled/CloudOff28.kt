package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CloudOff28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CloudOff28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.28f, 2.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(5.54f, 5.542f)
            curveToRelative(-0.344f, 0.676f, -0.583f, 1.415f, -0.692f, 2.195f)
            curveTo(4.233f, 11.237f, 2f, 13.607f, 2f, 16.5f)
            curveTo(2f, 19.538f, 4.462f, 22f, 7.5f, 22f)
            horizontalLineToRelative(13f)
            curveToRelative(0.142f, 0f, 0.283f, -0.005f, 0.423f, -0.016f)
            lineToRelative(3.796f, 3.796f)
            curveToRelative(0.293f, 0.293f, 0.768f, 0.293f, 1.061f, 0f)
            curveToRelative(0.293f, -0.292f, 0.293f, -0.767f, 0f, -1.06f)
            lineTo(3.28f, 2.22f)
            close()
            moveToRelative(6.396f, 4.275f)
            lineToRelative(14.282f, 14.282f)
            curveTo(25.204f, 19.768f, 26f, 18.227f, 26f, 16.5f)
            curveToRelative(0f, -2.892f, -2.233f, -5.263f, -5.069f, -5.483f)
            curveTo(20.453f, 7.616f, 17.532f, 5f, 14f, 5f)
            curveToRelative(-1.632f, 0f, -3.133f, 0.558f, -4.324f, 1.495f)
            close()
        }
    }.build()
}
