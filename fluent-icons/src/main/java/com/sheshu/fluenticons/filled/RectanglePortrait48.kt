package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.RectanglePortrait48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RectanglePortrait48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.25f, 44f)
            curveTo(10.798f, 44f, 8f, 41.202f, 8f, 37.75f)
            verticalLineToRelative(-27.5f)
            curveTo(8f, 6.798f, 10.798f, 4f, 14.25f, 4f)
            horizontalLineToRelative(19.5f)
            curveTo(37.202f, 4f, 40f, 6.798f, 40f, 10.25f)
            verticalLineToRelative(27.5f)
            curveToRelative(0f, 3.452f, -2.798f, 6.25f, -6.25f, 6.25f)
            horizontalLineToRelative(-19.5f)
            close()
        }
    }.build()
}
