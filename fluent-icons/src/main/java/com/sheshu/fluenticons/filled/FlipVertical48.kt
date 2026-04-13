package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlipVertical48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlipVertical48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(39.312f, 4.239f)
            curveTo(39.741f, 4.515f, 40f, 4.99f, 40f, 5.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-33f)
            curveToRelative(-0.706f, 0f, -1.316f, -0.492f, -1.466f, -1.182f)
            curveToRelative(-0.15f, -0.69f, 0.203f, -1.391f, 0.845f, -1.684f)
            lineToRelative(33f, -15f)
            curveToRelative(0.465f, -0.21f, 1.004f, -0.171f, 1.433f, 0.105f)
            close()
            moveTo(12.425f, 19f)
            horizontalLineTo(37f)
            verticalLineTo(7.83f)
            lineTo(12.425f, 19f)
            close()
            moveTo(40f, 43f)
            curveToRelative(0f, 0.342f, -0.175f, 0.66f, -0.464f, 0.844f)
            curveToRelative(-0.289f, 0.184f, -0.652f, 0.207f, -0.962f, 0.06f)
            lineToRelative(-34f, -16f)
            curveToRelative(-0.423f, -0.199f, -0.652f, -0.665f, -0.55f, -1.122f)
            curveTo(4.127f, 26.325f, 4.532f, 26f, 5f, 26f)
            horizontalLineToRelative(34f)
            curveToRelative(0.553f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(16f)
            close()
        }
    }.build()
}
