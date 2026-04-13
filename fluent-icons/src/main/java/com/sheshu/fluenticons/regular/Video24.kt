package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Video24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Video24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.25f, 5f)
            curveTo(3.455f, 5f, 2f, 6.455f, 2f, 8.25f)
            verticalLineToRelative(7.5f)
            curveTo(2f, 17.545f, 3.455f, 19f, 5.25f, 19f)
            horizontalLineToRelative(7.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-0.312f)
            lineToRelative(3.258f, 2.25f)
            curveToRelative(1.16f, 0.8f, 2.744f, -0.03f, 2.744f, -1.44f)
            verticalLineTo(7.751f)
            curveToRelative(0f, -1.41f, -1.584f, -2.242f, -2.744f, -1.44f)
            lineTo(16f, 8.562f)
            verticalLineTo(8.25f)
            curveTo(16f, 6.455f, 14.545f, 5f, 12.75f, 5f)
            horizontalLineToRelative(-7.5f)
            close()
            moveTo(16f, 10.384f)
            lineToRelative(4.11f, -2.838f)
            curveToRelative(0.166f, -0.114f, 0.392f, 0.005f, 0.392f, 0.206f)
            verticalLineToRelative(8.495f)
            curveToRelative(0f, 0.202f, -0.226f, 0.32f, -0.392f, 0.206f)
            lineTo(16f, 13.615f)
            verticalLineToRelative(-3.231f)
            close()
            moveTo(3.5f, 8.25f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-7.5f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            verticalLineToRelative(-7.5f)
            close()
        }
    }.build()
}
