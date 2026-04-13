package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Cursor24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Cursor24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 3.483f)
            curveToRelative(0f, -1.248f, 1.436f, -1.95f, 2.421f, -1.184f)
            lineToRelative(13.514f, 10.513f)
            curveToRelative(1.128f, 0.877f, 0.508f, 2.684f, -0.92f, 2.684f)
            horizontalLineToRelative(-6.853f)
            curveToRelative(-0.505f, 0f, -0.981f, 0.23f, -1.294f, 0.626f)
            lineToRelative(-4.191f, 5.3f)
            curveTo(7.295f, 22.538f, 5.5f, 21.914f, 5.5f, 20.492f)
            verticalLineTo(3.483f)
            close()
            moveToRelative(15.014f, 10.513f)
            lineTo(7f, 3.483f)
            verticalLineToRelative(17.009f)
            lineToRelative(4.191f, -5.3f)
            curveToRelative(0.597f, -0.756f, 1.508f, -1.196f, 2.47f, -1.196f)
            horizontalLineToRelative(6.853f)
            close()
        }
    }.build()
}
