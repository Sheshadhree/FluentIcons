package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Spacebar20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Spacebar20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.75f, 7.75f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(13f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            reflectiveCurveTo(18f, 8.086f, 18f, 8.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-13f)
            curveTo(2.672f, 12f, 2f, 11.328f, 2f, 10.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            close()
        }
    }.build()
}
