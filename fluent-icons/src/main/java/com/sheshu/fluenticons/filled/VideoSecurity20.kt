package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoSecurity20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoSecurity20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(5f)
            close()
            moveToRelative(13f, 5.664f)
            verticalLineTo(5.332f)
            lineToRelative(2.255f, -1.27f)
            curveToRelative(0.155f, -0.087f, 0.344f, -0.085f, 0.497f, 0.005f)
            curveTo(17.906f, 4.157f, 18f, 4.32f, 18f, 4.498f)
            verticalLineTo(11.5f)
            curveToRelative(0f, 0.178f, -0.094f, 0.342f, -0.248f, 0.432f)
            curveToRelative(-0.153f, 0.09f, -0.343f, 0.09f, -0.498f, 0.003f)
            lineTo(15f, 10.665f)
            close()
            moveTo(7f, 13.75f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(0.5f)
            curveTo(10f, 16.321f, 8.321f, 18f, 6.25f, 18f)
            horizontalLineTo(3.5f)
            curveTo(3.224f, 18f, 3f, 17.776f, 3f, 17.5f)
            verticalLineToRelative(-1.75f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(2.75f)
            curveTo(6.664f, 15.25f, 7f, 14.914f, 7f, 14.5f)
            verticalLineToRelative(-0.75f)
            close()
        }
    }.build()
}
