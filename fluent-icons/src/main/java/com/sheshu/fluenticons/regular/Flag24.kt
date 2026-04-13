package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Flag24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Flag24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 3.748f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(16.504f)
            curveToRelative(0.618f, 0f, 0.971f, 0.706f, 0.6f, 1.2f)
            lineTo(16.69f, 9.75f)
            lineToRelative(4.164f, 5.551f)
            curveToRelative(0.371f, 0.495f, 0.018f, 1.2f, -0.6f, 1.2f)
            horizontalLineTo(4.5f)
            verticalLineToRelative(4.75f)
            curveToRelative(0f, 0.38f, -0.282f, 0.693f, -0.648f, 0.743f)
            lineTo(3.75f, 22f)
            curveToRelative(-0.38f, 0f, -0.693f, -0.282f, -0.743f, -0.648f)
            lineTo(3f, 21.25f)
            verticalLineTo(3.748f)
            close()
            moveToRelative(15.754f, 0.75f)
            horizontalLineTo(4.5f)
            verticalLineToRelative(10.503f)
            horizontalLineToRelative(14.254f)
            lineToRelative(-3.602f, -4.802f)
            curveToRelative(-0.2f, -0.266f, -0.2f, -0.633f, 0f, -0.9f)
            lineToRelative(3.602f, -4.8f)
            close()
        }
    }.build()
}
