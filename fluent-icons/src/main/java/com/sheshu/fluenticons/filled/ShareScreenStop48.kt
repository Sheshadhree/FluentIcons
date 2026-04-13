package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ShareScreenStop48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShareScreenStop48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.75f, 8f)
            curveTo(6.127f, 8f, 4f, 10.127f, 4f, 12.75f)
            verticalLineToRelative(22.5f)
            curveTo(4f, 37.873f, 6.127f, 40f, 8.75f, 40f)
            horizontalLineToRelative(30.5f)
            curveToRelative(2.623f, 0f, 4.75f, -2.127f, 4.75f, -4.75f)
            verticalLineToRelative(-22.5f)
            curveTo(44f, 10.127f, 41.873f, 8f, 39.25f, 8f)
            horizontalLineTo(8.75f)
            close()
            moveToRelative(13.482f, 16f)
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
        }
    }.build()
}
