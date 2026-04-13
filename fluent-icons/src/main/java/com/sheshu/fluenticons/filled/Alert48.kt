package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Alert48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Alert48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 4f)
            curveTo(15.716f, 4f, 9f, 10.716f, 9f, 19f)
            verticalLineToRelative(8.486f)
            lineToRelative(-2.804f, 6.356f)
            curveTo(5.54f, 35.329f, 6.629f, 37f, 8.254f, 37f)
            horizontalLineToRelative(31.492f)
            curveToRelative(1.625f, 0f, 2.715f, -1.671f, 2.058f, -3.158f)
            lineTo(39f, 27.487f)
            verticalLineTo(19f)
            curveToRelative(0f, -8.284f, -6.716f, -15f, -15f, -15f)
            close()
            moveToRelative(0f, 40f)
            curveToRelative(-2.973f, 0f, -5.44f, -2.162f, -5.917f, -5f)
            horizontalLineToRelative(11.834f)
            curveToRelative(-0.476f, 2.838f, -2.944f, 5f, -5.917f, 5f)
            close()
        }
    }.build()
}
