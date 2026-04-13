package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ShareScreenStart28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShareScreenStart28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.25f, 4.999f)
            curveTo(3.007f, 4.999f, 2f, 6.006f, 2f, 7.249f)
            verticalLineToRelative(13.5f)
            curveTo(2f, 21.993f, 3.007f, 23f, 4.25f, 23f)
            horizontalLineToRelative(19.5f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineTo(7.25f)
            curveTo(26f, 6.007f, 24.993f, 5f, 23.75f, 5f)
            horizontalLineTo(4.25f)
            close()
            moveTo(14.528f, 8.84f)
            lineToRelative(3.255f, 3.255f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.768f, 0f, 1.06f)
            curveToRelative(-0.293f, 0.293f, -0.768f, 0.293f, -1.061f, 0f)
            lineToRelative(-1.974f, -1.974f)
            verticalLineToRelative(7.447f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-7.445f)
            lineToRelative(-1.97f, 1.972f)
            curveToRelative(-0.292f, 0.293f, -0.767f, 0.294f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.292f, -0.294f, -0.767f, -0.001f, -1.06f)
            lineToRelative(3.25f, -3.254f)
            curveToRelative(0.14f, -0.141f, 0.332f, -0.22f, 0.53f, -0.22f)
            curveToRelative(0.2f, 0f, 0.39f, 0.079f, 0.531f, 0.22f)
            close()
        }
    }.build()
}
