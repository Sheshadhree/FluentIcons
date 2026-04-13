package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlipHorizontal48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlipHorizontal48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(43.761f, 39.312f)
            curveTo(43.485f, 39.741f, 43.01f, 40f, 42.5f, 40f)
            horizontalLineToRelative(-15f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.671f, -1.5f, -1.5f)
            verticalLineToRelative(-33f)
            curveToRelative(0f, -0.706f, 0.492f, -1.316f, 1.182f, -1.466f)
            curveToRelative(0.69f, -0.15f, 1.391f, 0.203f, 1.684f, 0.845f)
            lineToRelative(15f, 33f)
            curveToRelative(0.21f, 0.465f, 0.171f, 1.004f, -0.105f, 1.433f)
            close()
            moveTo(29f, 12.425f)
            verticalLineTo(37f)
            horizontalLineToRelative(11.17f)
            lineTo(29f, 12.425f)
            close()
            moveTo(5f, 40f)
            curveToRelative(-0.342f, 0f, -0.66f, -0.175f, -0.844f, -0.464f)
            curveToRelative(-0.184f, -0.289f, -0.207f, -0.652f, -0.06f, -0.962f)
            lineToRelative(16f, -34f)
            curveToRelative(0.199f, -0.423f, 0.665f, -0.652f, 1.122f, -0.55f)
            curveTo(21.675f, 4.127f, 22f, 4.532f, 22f, 5f)
            verticalLineToRelative(34f)
            curveToRelative(0f, 0.553f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(5f)
            close()
        }
    }.build()
}
