package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Flowchart32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Flowchart32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 3f)
            curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(5.269f)
            curveToRelative(-0.147f, 0.085f, -0.286f, 0.19f, -0.412f, 0.317f)
            lineToRelative(-4.002f, 4.002f)
            curveToRelative(-0.781f, 0.781f, -0.781f, 2.047f, 0f, 2.828f)
            lineToRelative(4.002f, 4.003f)
            curveToRelative(0.781f, 0.78f, 2.047f, 0.78f, 2.828f, 0f)
            lineToRelative(4.003f, -4.003f)
            curveToRelative(0.127f, -0.127f, 0.233f, -0.267f, 0.32f, -0.416f)
            horizontalLineToRelative(5.26f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 1.657f, 1.344f, 3f, 3f, 3f)
            horizontalLineToRelative(4f)
            curveToRelative(1.658f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -1.657f, -1.342f, -3f, -3f, -3f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.656f, 0f, -3f, 1.343f, -3f, 3f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(-5.263f)
            curveToRelative(-0.086f, -0.147f, -0.191f, -0.286f, -0.317f, -0.412f)
            lineToRelative(-4.003f, -4.002f)
            curveTo(9.29f, 18.458f, 9.15f, 18.352f, 9f, 18.266f)
            verticalLineTo(13f)
            horizontalLineToRelative(1f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(6f)
            close()
        }
    }.build()
}
