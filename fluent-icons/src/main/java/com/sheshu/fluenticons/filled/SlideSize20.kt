package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SlideSize20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SlideSize20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 6.75f)
            curveTo(2f, 5.231f, 3.231f, 4f, 4.75f, 4f)
            horizontalLineToRelative(10.5f)
            curveTo(16.769f, 4f, 18f, 5.231f, 18f, 6.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 16f, 2f, 14.769f, 2f, 13.25f)
            verticalLineToRelative(-6.5f)
            close()
            moveToRelative(9f, -0.25f)
            curveTo(11f, 6.776f, 11.224f, 7f, 11.5f, 7f)
            horizontalLineToRelative(0.793f)
            lineToRelative(-1.647f, 1.646f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.707f)
            curveToRelative(0.196f, 0.196f, 0.512f, 0.196f, 0.708f, 0f)
            lineTo(13f, 7.708f)
            verticalLineTo(8.5f)
            curveTo(13f, 8.776f, 13.224f, 9f, 13.5f, 9f)
            reflectiveCurveTo(14f, 8.776f, 14f, 8.5f)
            verticalLineToRelative(-2f)
            curveTo(14f, 6.224f, 13.776f, 6f, 13.5f, 6f)
            horizontalLineToRelative(-2f)
            curveTo(11.224f, 6f, 11f, 6.224f, 11f, 6.5f)
            close()
            moveToRelative(-1.646f, 4.146f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            lineTo(7f, 12.293f)
            verticalLineTo(11.5f)
            curveTo(7f, 11.224f, 6.776f, 11f, 6.5f, 11f)
            reflectiveCurveTo(6f, 11.224f, 6f, 11.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.133f, 0.053f, 0.26f, 0.146f, 0.354f)
            curveTo(6.24f, 13.947f, 6.367f, 14f, 6.5f, 14f)
            horizontalLineToRelative(2f)
            curveTo(8.776f, 14f, 9f, 13.776f, 9f, 13.5f)
            reflectiveCurveTo(8.776f, 13f, 8.5f, 13f)
            horizontalLineTo(7.707f)
            lineToRelative(1.647f, -1.646f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            close()
        }
    }.build()
}
