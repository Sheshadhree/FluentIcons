package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowRedo28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowRedo28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.134f, 4.654f)
            curveTo(9.613f, 2.892f, 13f, 3.166f, 15.162f, 5.304f)
            lineToRelative(6.27f, 6.195f)
            horizontalLineToRelative(-7.679f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            curveToRelative(0f, 0.415f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(9.5f)
            curveToRelative(0.199f, 0f, 0.39f, -0.079f, 0.53f, -0.22f)
            curveToRelative(0.141f, -0.14f, 0.22f, -0.33f, 0.22f, -0.53f)
            verticalLineTo(2.75f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveToRelative(-0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(7.7f)
            lineToRelative(-6.287f, -6.214f)
            curveToRelative(-2.681f, -2.65f, -6.879f, -2.988f, -9.951f, -0.804f)
            curveToRelative(-3.991f, 2.838f, -4.388f, 8.62f, -0.82f, 11.975f)
            lineToRelative(11.04f, 10.39f)
            curveToRelative(0.302f, 0.283f, 0.777f, 0.269f, 1.06f, -0.033f)
            curveToRelative(0.285f, -0.302f, 0.27f, -0.776f, -0.032f, -1.06f)
            lineToRelative(-11.04f, -10.39f)
            curveToRelative(-2.878f, -2.707f, -2.559f, -7.37f, 0.661f, -9.66f)
            close()
        }
    }.build()
}
