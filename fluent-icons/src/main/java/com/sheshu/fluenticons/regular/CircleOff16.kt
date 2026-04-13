package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CircleOff16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CircleOff16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.874f, 12.582f)
            lineToRelative(2.272f, 2.272f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-13f, -13f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(2.272f, 2.272f)
            curveTo(2.534f, 5.17f, 2f, 6.523f, 2f, 8f)
            curveToRelative(0f, 3.314f, 2.686f, 6f, 6f, 6f)
            curveToRelative(1.477f, 0f, 2.83f, -0.534f, 3.874f, -1.418f)
            close()
            moveToRelative(-0.71f, -0.71f)
            curveTo(10.302f, 12.576f, 9.201f, 13f, 8f, 13f)
            curveToRelative(-2.761f, 0f, -5f, -2.239f, -5f, -5f)
            curveToRelative(0f, -1.2f, 0.423f, -2.302f, 1.128f, -3.164f)
            lineToRelative(7.036f, 7.035f)
            close()
            moveTo(13f, 8f)
            curveToRelative(0f, 0.834f, -0.204f, 1.621f, -0.566f, 2.313f)
            lineToRelative(0.735f, 0.735f)
            curveTo(13.697f, 10.155f, 14f, 9.113f, 14f, 8f)
            curveToRelative(0f, -3.314f, -2.686f, -6f, -6f, -6f)
            curveToRelative(-1.113f, 0f, -2.155f, 0.303f, -3.048f, 0.83f)
            lineToRelative(0.735f, 0.736f)
            curveTo(6.38f, 3.204f, 7.166f, 3f, 8f, 3f)
            curveToRelative(2.761f, 0f, 5f, 2.239f, 5f, 5f)
            close()
        }
    }.build()
}
