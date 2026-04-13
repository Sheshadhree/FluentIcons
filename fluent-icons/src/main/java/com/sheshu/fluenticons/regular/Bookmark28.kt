package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Bookmark28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Bookmark28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 6.75f)
            curveTo(6f, 4.955f, 7.455f, 3.5f, 9.25f, 3.5f)
            horizontalLineToRelative(9.5f)
            curveTo(20.545f, 3.5f, 22f, 4.955f, 22f, 6.75f)
            verticalLineToRelative(18f)
            curveToRelative(0f, 0.285f, -0.161f, 0.545f, -0.416f, 0.672f)
            curveToRelative(-0.256f, 0.126f, -0.56f, 0.098f, -0.787f, -0.075f)
            lineTo(14f, 20.192f)
            lineToRelative(-6.797f, 5.157f)
            curveToRelative(-0.227f, 0.172f, -0.532f, 0.2f, -0.787f, 0.074f)
            curveTo(6.161f, 25.295f, 6f, 25.035f, 6f, 24.75f)
            verticalLineToRelative(-18f)
            close()
            moveTo(9.25f, 5f)
            curveTo(8.284f, 5f, 7.5f, 5.784f, 7.5f, 6.75f)
            verticalLineToRelative(16.49f)
            lineToRelative(6.047f, -4.587f)
            curveToRelative(0.268f, -0.204f, 0.638f, -0.204f, 0.906f, 0f)
            lineTo(20.5f, 23.24f)
            verticalLineTo(6.75f)
            curveTo(20.5f, 5.784f, 19.716f, 5f, 18.75f, 5f)
            horizontalLineToRelative(-9.5f)
            close()
        }
    }.build()
}
