package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Previous20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Previous20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 3.5f)
            curveTo(3f, 3.224f, 3.224f, 3f, 3.5f, 3f)
            reflectiveCurveTo(4f, 3.224f, 4f, 3.5f)
            verticalLineToRelative(13f)
            curveTo(4f, 16.776f, 3.776f, 17f, 3.5f, 17f)
            reflectiveCurveTo(3f, 16.776f, 3f, 16.5f)
            verticalLineToRelative(-13f)
            close()
            moveToRelative(14f, 0.752f)
            curveToRelative(0f, -1f, -1.117f, -1.595f, -1.947f, -1.038f)
            lineToRelative(-8.5f, 5.707f)
            curveToRelative(-0.734f, 0.494f, -0.737f, 1.573f, -0.006f, 2.071f)
            lineToRelative(8.499f, 5.793f)
            curveTo(15.876f, 17.351f, 17f, 16.756f, 17f, 15.752f)
            verticalLineToRelative(-11.5f)
            close()
            moveToRelative(-1.39f, -0.207f)
            curveTo(15.777f, 3.933f, 16f, 4.052f, 16f, 4.252f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 0.2f, -0.225f, 0.32f, -0.391f, 0.207f)
            lineToRelative(-8.5f, -5.793f)
            curveToRelative(-0.145f, -0.1f, -0.145f, -0.316f, 0.002f, -0.414f)
            lineToRelative(8.5f, -5.707f)
            close()
        }
    }.build()
}
