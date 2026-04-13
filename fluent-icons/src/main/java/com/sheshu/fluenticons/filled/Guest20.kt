package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Guest20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Guest20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 3.5f)
            curveTo(16f, 2.672f, 15.328f, 2f, 14.5f, 2f)
            horizontalLineToRelative(-9f)
            curveTo(4.672f, 2f, 4f, 2.672f, 4f, 3.5f)
            verticalLineToRelative(13f)
            curveTo(4f, 17.328f, 4.672f, 18f, 5.5f, 18f)
            horizontalLineToRelative(9f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-13f)
            close()
            moveToRelative(-8f, 1f)
            curveTo(8f, 4.224f, 8.224f, 4f, 8.5f, 4f)
            horizontalLineToRelative(3f)
            curveTo(11.776f, 4f, 12f, 4.224f, 12f, 4.5f)
            reflectiveCurveTo(11.776f, 5f, 11.5f, 5f)
            horizontalLineToRelative(-3f)
            curveTo(8.224f, 5f, 8f, 4.776f, 8f, 4.5f)
            close()
            moveTo(10f, 7f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            curveToRelative(-1.104f, 0f, -2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.896f, -2f, 2f, -2f)
            close()
            moveToRelative(-2.25f, 5f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.665f, 0f, 1.298f, 0.55f, 1.218f, 1.302f)
            curveToRelative(-0.06f, 0.56f, -0.235f, 1.254f, -0.784f, 1.806f)
            curveTo(12.127f, 15.666f, 11.266f, 16f, 10f, 16f)
            curveToRelative(-1.265f, 0f, -2.127f, -0.334f, -2.684f, -0.892f)
            curveToRelative(-0.55f, -0.552f, -0.724f, -1.247f, -0.784f, -1.806f)
            curveTo(6.452f, 12.55f, 7.086f, 12f, 7.75f, 12f)
            close()
        }
    }.build()
}
