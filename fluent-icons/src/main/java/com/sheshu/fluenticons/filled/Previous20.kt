package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Previous20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Previous20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 4.252f)
            curveToRelative(0f, -1f, -1.116f, -1.595f, -1.947f, -1.038f)
            lineTo(6.554f, 8.921f)
            curveToRelative(-0.734f, 0.494f, -0.738f, 1.573f, -0.007f, 2.071f)
            lineToRelative(8.5f, 5.793f)
            curveTo(15.875f, 17.351f, 17f, 16.756f, 17f, 15.752f)
            verticalLineToRelative(-11.5f)
            close()
            moveTo(3f, 3.5f)
            curveTo(3f, 3.224f, 3.224f, 3f, 3.5f, 3f)
            reflectiveCurveTo(4f, 3.224f, 4f, 3.5f)
            verticalLineToRelative(13f)
            curveTo(4f, 16.776f, 3.776f, 17f, 3.5f, 17f)
            reflectiveCurveTo(3f, 16.776f, 3f, 16.5f)
            verticalLineToRelative(-13f)
            close()
        }
    }.build()
}
