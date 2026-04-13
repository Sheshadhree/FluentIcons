package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Next20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Next20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 4.252f)
            curveToRelative(0f, -1f, 1.116f, -1.595f, 1.947f, -1.038f)
            lineToRelative(8.499f, 5.707f)
            curveToRelative(0.734f, 0.494f, 0.738f, 1.573f, 0.007f, 2.071f)
            lineToRelative(-8.5f, 5.793f)
            curveTo(4.125f, 17.351f, 3f, 16.756f, 3f, 15.752f)
            verticalLineToRelative(-11.5f)
            close()
            moveTo(17f, 3.5f)
            curveTo(17f, 3.224f, 16.776f, 3f, 16.5f, 3f)
            reflectiveCurveTo(16f, 3.224f, 16f, 3.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-13f)
            close()
        }
    }.build()
}
