package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.RectangleLandscape48: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.RectangleLandscape48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 14.25f)
            curveTo(4f, 10.798f, 6.798f, 8f, 10.25f, 8f)
            horizontalLineToRelative(27.5f)
            curveTo(41.202f, 8f, 44f, 10.798f, 44f, 14.25f)
            verticalLineToRelative(19.5f)
            curveToRelative(0f, 3.452f, -2.798f, 6.25f, -6.25f, 6.25f)
            horizontalLineToRelative(-27.5f)
            curveTo(6.798f, 40f, 4f, 37.202f, 4f, 33.75f)
            verticalLineToRelative(-19.5f)
            close()
            moveToRelative(6.25f, -3.75f)
            curveToRelative(-2.071f, 0f, -3.75f, 1.679f, -3.75f, 3.75f)
            verticalLineToRelative(19.5f)
            curveToRelative(0f, 2.071f, 1.679f, 3.75f, 3.75f, 3.75f)
            horizontalLineToRelative(27.5f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineToRelative(-19.5f)
            curveToRelative(0f, -2.071f, -1.679f, -3.75f, -3.75f, -3.75f)
            horizontalLineToRelative(-27.5f)
            close()
        }
    }.build()
}
