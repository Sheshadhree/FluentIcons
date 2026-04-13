package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CloudDesktop24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CloudDesktop24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22f, 13f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(0.25f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            curveToRelative(0f, 0.025f, -0.002f, 0.05f, -0.004f, 0.074f)
            curveTo(20f, 22.341f, 20f, 22.358f, 20f, 22.375f)
            curveTo(20f, 22.651f, 19.651f, 23f, 19.375f, 23f)
            horizontalLineToRelative(-3.75f)
            curveTo(15.349f, 23f, 15f, 22.651f, 15f, 22.375f)
            curveToRelative(0f, -0.017f, 0.002f, -0.034f, 0.004f, -0.05f)
            curveTo(15.002f, 22.3f, 15f, 22.274f, 15f, 22.25f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineTo(16f)
            verticalLineTo(20f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(9f)
            close()
            moveTo(12f, 4f)
            curveToRelative(2.98f, 0f, 5.452f, 2.172f, 5.92f, 5.02f)
            curveToRelative(1.775f, 0.164f, 3.251f, 1.359f, 3.824f, 2.98f)
            horizontalLineTo(13f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(4f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 18f, 2f, 15.985f, 2f, 13.5f)
            curveToRelative(0f, -2.344f, 1.792f, -4.269f, 4.08f, -4.48f)
            curveTo(6.548f, 6.172f, 9.02f, 4f, 12f, 4f)
            close()
        }
    }.build()
}
