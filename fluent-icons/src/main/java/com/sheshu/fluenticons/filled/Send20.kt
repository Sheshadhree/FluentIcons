package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Send20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Send20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.724f, 2.053f)
            curveToRelative(-0.176f, -0.088f, -0.387f, -0.065f, -0.54f, 0.06f)
            curveToRelative(-0.152f, 0.124f, -0.218f, 0.326f, -0.167f, 0.516f)
            lineToRelative(1.498f, 5.618f)
            curveToRelative(0.05f, 0.19f, 0.207f, 0.332f, 0.4f, 0.364f)
            lineToRelative(6.855f, 1.142f)
            curveToRelative(0.279f, 0.047f, 0.279f, 0.447f, 0f, 0.494f)
            lineToRelative(-6.854f, 1.142f)
            curveToRelative(-0.194f, 0.032f, -0.35f, 0.175f, -0.401f, 0.364f)
            lineToRelative(-1.498f, 5.618f)
            curveToRelative(-0.05f, 0.19f, 0.015f, 0.392f, 0.167f, 0.517f)
            curveToRelative(0.153f, 0.124f, 0.364f, 0.147f, 0.54f, 0.06f)
            lineToRelative(15f, -7.5f)
            curveTo(17.893f, 10.362f, 18f, 10.188f, 18f, 10f)
            curveToRelative(0f, -0.19f, -0.107f, -0.363f, -0.276f, -0.447f)
            lineToRelative(-15f, -7.5f)
            close()
        }
    }.build()
}
