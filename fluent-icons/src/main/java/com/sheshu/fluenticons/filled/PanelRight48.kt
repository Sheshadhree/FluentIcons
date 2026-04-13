package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PanelRight48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PanelRight48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(44f, 13.25f)
            curveTo(44f, 9.798f, 41.202f, 7f, 37.75f, 7f)
            horizontalLineToRelative(-27.5f)
            curveTo(6.798f, 7f, 4f, 9.798f, 4f, 13.25f)
            verticalLineToRelative(21.5f)
            curveTo(4f, 38.202f, 6.798f, 41f, 10.25f, 41f)
            horizontalLineToRelative(27.5f)
            curveToRelative(3.452f, 0f, 6.25f, -2.798f, 6.25f, -6.25f)
            verticalLineToRelative(-21.5f)
            close()
            moveTo(10.25f, 38.5f)
            curveToRelative(-2.071f, 0f, -3.75f, -1.679f, -3.75f, -3.75f)
            verticalLineToRelative(-21.5f)
            curveToRelative(0f, -2.071f, 1.679f, -3.75f, 3.75f, -3.75f)
            horizontalLineToRelative(19.5f)
            verticalLineToRelative(29f)
            horizontalLineToRelative(-19.5f)
            close()
        }
    }.build()
}
