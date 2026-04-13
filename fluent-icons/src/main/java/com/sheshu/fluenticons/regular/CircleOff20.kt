package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CircleOff20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CircleOff20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 4.708f)
            lineTo(2.148f, 2.853f)
            curveToRelative(-0.196f, -0.195f, -0.196f, -0.511f, 0f, -0.707f)
            curveToRelative(0.195f, -0.195f, 0.511f, -0.195f, 0.707f, 0f)
            lineToRelative(15f, 15f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineToRelative(-1.854f, -1.855f)
            curveTo(13.882f, 17.244f, 12.03f, 18f, 10f, 18f)
            curveToRelative(-4.418f, 0f, -8f, -3.582f, -8f, -8f)
            curveToRelative(0f, -2.03f, 0.756f, -3.882f, 2f, -5.292f)
            close()
            moveTo(14.585f, 15.29f)
            lineTo(4.709f, 5.416f)
            curveTo(3.644f, 6.644f, 3f, 8.247f, 3f, 10f)
            curveToRelative(0f, 3.866f, 3.134f, 7f, 7f, 7f)
            curveToRelative(1.753f, 0f, 3.356f, -0.644f, 4.584f, -1.71f)
            close()
            moveTo(17f, 10f)
            curveToRelative(0f, 1.39f, -0.405f, 2.686f, -1.104f, 3.775f)
            lineToRelative(0.722f, 0.721f)
            curveTo(17.49f, 13.215f, 18f, 11.667f, 18f, 10f)
            curveToRelative(0f, -4.418f, -3.582f, -8f, -8f, -8f)
            curveToRelative(-1.667f, 0f, -3.215f, 0.51f, -4.496f, 1.382f)
            lineToRelative(0.721f, 0.722f)
            curveTo(7.315f, 3.405f, 8.61f, 3f, 10f, 3f)
            curveToRelative(3.866f, 0f, 7f, 3.134f, 7f, 7f)
            close()
        }
    }.build()
}
