package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ShareScreenStop48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ShareScreenStop48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.232f, 24f)
            lineToRelative(-5.866f, -5.866f)
            curveToRelative(-0.488f, -0.488f, -0.488f, -1.28f, 0f, -1.768f)
            reflectiveCurveToRelative(1.28f, -0.488f, 1.768f, 0f)
            lineTo(24f, 22.232f)
            lineToRelative(5.866f, -5.866f)
            curveToRelative(0.488f, -0.488f, 1.28f, -0.488f, 1.768f, 0f)
            reflectiveCurveToRelative(0.488f, 1.28f, 0f, 1.768f)
            lineTo(25.768f, 24f)
            lineToRelative(5.866f, 5.866f)
            curveToRelative(0.488f, 0.488f, 0.488f, 1.28f, 0f, 1.768f)
            reflectiveCurveToRelative(-1.28f, 0.488f, -1.768f, 0f)
            lineTo(24f, 25.768f)
            lineToRelative(-5.866f, 5.866f)
            curveToRelative(-0.488f, 0.488f, -1.28f, 0.488f, -1.768f, 0f)
            reflectiveCurveToRelative(-0.488f, -1.28f, 0f, -1.768f)
            lineTo(22.232f, 24f)
            close()
            moveTo(4f, 12.75f)
            curveTo(4f, 10.127f, 6.127f, 8f, 8.75f, 8f)
            horizontalLineToRelative(30.5f)
            curveTo(41.873f, 8f, 44f, 10.127f, 44f, 12.75f)
            verticalLineToRelative(22.5f)
            curveToRelative(0f, 2.623f, -2.127f, 4.75f, -4.75f, 4.75f)
            horizontalLineTo(8.75f)
            curveTo(6.127f, 40f, 4f, 37.873f, 4f, 35.25f)
            verticalLineToRelative(-22.5f)
            close()
            moveToRelative(4.75f, -2.25f)
            curveToRelative(-1.243f, 0f, -2.25f, 1.007f, -2.25f, 2.25f)
            verticalLineToRelative(22.5f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.25f, 2.25f)
            horizontalLineToRelative(30.5f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineToRelative(-22.5f)
            curveToRelative(0f, -1.243f, -1.007f, -2.25f, -2.25f, -2.25f)
            horizontalLineTo(8.75f)
            close()
        }
    }.build()
}
