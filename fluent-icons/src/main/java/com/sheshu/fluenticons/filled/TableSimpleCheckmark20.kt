package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableSimpleCheckmark20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableSimpleCheckmark20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 17f)
            horizontalLineToRelative(-3.5f)
            verticalLineToRelative(-6.5f)
            horizontalLineTo(17f)
            verticalLineTo(14f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            close()
            moveToRelative(3f, -7.5f)
            horizontalLineToRelative(-6.5f)
            verticalLineTo(3f)
            horizontalLineTo(14f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(3.5f)
            close()
            moveToRelative(-7.5f, 0f)
            verticalLineTo(3f)
            horizontalLineTo(6f)
            curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
            verticalLineToRelative(3.5f)
            horizontalLineToRelative(6.5f)
            close()
            moveToRelative(0f, 7.5f)
            verticalLineToRelative(-6.5f)
            horizontalLineTo(3f)
            verticalLineTo(14f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(3.5f)
            close()
            moveToRelative(5.852f, -3.896f)
            curveToRelative(0.196f, -0.196f, 0.196f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.195f, -0.195f, -0.511f, -0.195f, -0.707f, 0f)
            lineToRelative(-1.397f, 1.397f)
            lineToRelative(-0.399f, -0.397f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0.001f)
            curveToRelative(-0.195f, 0.196f, -0.194f, 0.512f, 0.001f, 0.707f)
            lineToRelative(0.753f, 0.75f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.706f, 0f)
            lineToRelative(1.75f, -1.75f)
            close()
        }
    }.build()
}
